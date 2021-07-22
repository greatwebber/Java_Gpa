int [] arrEx = {1,2,3};
        // Declare scanner objects to save input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Score For COM121");
        // Enter COM121 SCORE
        arrEx[0] = in.nextInt();
        
        System.out.println("Enter Score For COM122");
        // Enter COM121 SCORE
        arrEx[1] = in.nextInt();
        
        System.out.println("Enter Score For COM123");
        // Enter COM121 SCORE
        arrEx[2] = in.nextInt();
        
        if(arrEx[0] < 40 || arrEx[1] < 40 || arrEx[2] < 40){
            System.out.println("Grade For"+ arrEx[0]+ "is : F");
            System.out.println("Grade For"+ arrEx[1]+ "is : F");
            System.out.println("Grade For"+ arrEx[2]+ "is : F");
        }
        else if(arrEx[0] <= 60 || arrEx[1] <= 60 || arrEx[2] <= 60){
            System.out.println("Grade For"+ arrEx[0]+ "is : P");
            System.out.println("Grade For"+ arrEx[1]+ "is : P");
            System.out.println("Grade For"+ arrEx[2]+ "is : P");
        }
        
        
        // // Calls the method
        // System.out.println(arrEx[userInput]);