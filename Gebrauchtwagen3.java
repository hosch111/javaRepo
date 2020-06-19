/**Löscht ein Auto
	
	public static void loeschen (Auto[] sortiment, String mod_loeschen){
		try {
			File datei = new File("Autos.txt");
			boolean neu = true;
			boolean geloescht = false;
			if (datei.exist()){
				BufferedWriter bw = new BufferedWriter(new FileWriter("Autos.txt",false));
				for (Auto element : sortiment){
					if (!(mod_loeschen.equals (element.getModell()))){
						if (!neu){
							bw.write("\n");
						}
						else {
							neu = false;
						}
					bw.write ("\n"+element.getPreis());
					bw.write ("\n"+element.getModell());
					bw.write ("\n"+element.getBaujahr());
					bw.write ("\n"+element.getKilometerstand());
					bw.write ("\n"+element.getFarbe());
					}
					else { 
						geloescht = true;
					}
				}
				bw.close();
			}
			else {
				System.out.print("Datei nicht vorhanden");
			}
			if (geloescht){
				System.out.print("Das Auto wurde geloescht");
			}
			else {
				System.out.print("Das Modell konnte nicht gefunden werden");
			}
		}
		catch(IOException ioAusnahme){
			System.out.print("Fehler beim Oeffnen der Datei");
		}
	} **/