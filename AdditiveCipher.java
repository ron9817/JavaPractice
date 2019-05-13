class AdditiveCipher{
	String msg;
	int key;
	AdditiveCipher(String msg, int key){
		System.out.println("Additive Cipher");
		this.msg=msg;
		this.key=key;
	}
	String generateCipherText(){
		String cipherText="";
		int i;
		int length=msg.length();
		char ch;
		int ascii;
		int ct;
		char ctChar;
		for (i=0;i<length;i++){
			ch=msg.charAt(i);
			//System.out.println("Message char"+ch);
			ascii=(int) ch;
			//System.out.println("Message char ascii"+ascii);
			ct=(ascii+key-65)%26+65;
			//System.out.println("Cipher ascii"+ct);
			ctChar=(char) ct;
			//System.out.println("Cipher ascii char"+ctChar);
			cipherText+=ctChar;
			//System.out.println("Cipher Text"+cipherText);
			
		}
		return cipherText;
	}
	String generatePlainText(){
		String plainText="";
		int i;
		int length=msg.length();
		char ch;
		int ascii;
		int ct;
		char ctChar;
		for (i=0;i<length;i++){
			ch=msg.charAt(i);
			//System.out.println("Message char"+ch);
			ascii=(int) ch;
			//System.out.println("Message char ascii"+ascii);
			if(ascii-key-65 >=0){
				ct=(ascii-key-65)%26+65;
			}else{
				ct=(ascii-key-65)+26+65;
			}
			//System.out.println("Cipher ascii"+ct);
			ctChar=(char) ct;
			//System.out.println("Cipher ascii char"+ctChar);
			plainText+=ctChar;
			//System.out.println("Cipher Text"+plainText);
			
		}
		return plainText;
	}
}
class Main{
	public static void main(String args []){
		if (args.length==3){
			if(Integer.parseInt(args[2])==1){
				AdditiveCipher ac=new AdditiveCipher(args[0], Integer.parseInt(args[1]));
				String cipherText=ac.generateCipherText();
				System.out.println("Encrypted Message: "+cipherText);
			}else if(Integer.parseInt(args[2])==2){
				AdditiveCipher ap=new AdditiveCipher(args[0], Integer.parseInt(args[1]));
				String plainText=ap.generatePlainText();
				System.out.println("Decrypted Message "+plainText);
			}else{
				System.out.println("No matching option found:\n\nSpecify 1 for encryption, 2 for decryption");
			}
		}else{
			System.out.println("No matching option found\n\njava main message key option\n\n--option:\n1-Encrypt\n2-Decrypt");			
		}
		
	}
}