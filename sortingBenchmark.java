import java.util.*;

class sortingBenchMark{
public static void main(String[] args){
	Scanner obj = new Scanner(System.in);
	
System.out.println("\n\n\t\tAlgorithm Benchmark \n ");
System.out.println(" ***************************************");
System.out.println("\t Choose Case");
System.out.println(" \n \t 1. Best Case\n \t 2.Average Case\n \t 3.Worst Case \n ");
System.out.println(" ***************************************");
System.out.println("\t Choose Sorting Algorithm");
System.out.println(" \n \t1.Bubble Sort \n \t2.Selection Sort \n \t3.Insertion Sort \n \t4.Quick Sort \n \t5.Merge Sort \n \t6.Heap Sort \n \t7.BenchMark All \n \t8.Start Over \n \t9.Exit");
System.out.println(" ***************************************");
System.out.println("Enter your choice for case ");

int choice = 0;
	try{
	choice = obj.nextInt();
	}catch(InputMismatchException e){
		System.out.println("Enter the correct choice");
		System.exit(0);
	}

System.out.println();

    switch(choice){
	case 1: System.out.println("Best Case");			
	      break;
    case 2: System.out.println("Average Case");
	      break;
    case 3: System.out.println("Worst Case");
	      break;
    default : System.out.println("Wrong Choice");
	       break;
}
System.out.println("________________________________________\n ");
System.out.println("enter the size");
int size = obj.nextInt();

System.out.println("Enter the sorting Algorithm ");

int choice1 = 0;
	try{
	choice1 = obj.nextInt();
	}catch(InputMismatchException e){
		System.out.println("Enter the correct choice");
		System.exit(0);
	}
              
   int[] a = new int[size];
    switch(choice){
	case 1:  for(int i=1;i<a.length;i++)
				  a[i]=i;	  
	              break;
    case 2:  for(int i = 0; i <  a.length; i++) 
                a[i] = (int)(Math.random()*100);  
	            break;
    case 3: for(int i=(a.length)-1;i>=0;i--)
				  a[i]=i;	  
	              break;
    default : System.out.println("Wrong Choice");
	            break;
	}
               		 
			 
 switch(choice1){
	case 1: System.out.println("Bubble Sort");
	         long startTime = System.nanoTime();
	        sortingAlgoBenchmark.bubble_srt(a);
			if(choice==1||choice==2||choice==3){
	           for(int i=1;i<a.length;i++)
		       System.out.print(a[i] + " ");
			    }
			
			 long duration = System.nanoTime() - startTime;
			System.out.println("\n The time duration in millisecond is = " + duration/1000000);
			break;
			
	case 2: System.out.println("Selection Sort");
	         startTime = System.nanoTime();
	        sortingAlgoBenchmark.SelectionSort(a);
	        if(choice==1||choice==2||choice==3){
	            for(int i=1;i<a.length;i++)
		        System.out.println(a[i] + " ");
			   }
			
			 duration = System.nanoTime() - startTime;
			System.out.println("\n The time duration in millisecond is = " + duration/1000000);
			break;


    case 3: System.out.println("Insertion Sort");
	         startTime = System.nanoTime();
	        sortingAlgoBenchmark.InsertionSort(a);
	        if(choice==1||choice==2||choice==3){
	            for(int i=1;i<a.length;i++)
		        System.out.println(a[i] + " ");
			   }
			 duration = System.nanoTime() - startTime;
			System.out.println("\n The time duration in millisecond is = " + duration/1000000);
			break;
			
	case 4:System.out.println("Quick Sort");
	      startTime = System.nanoTime();
		  sortingAlgoBenchmark  re=new sortingAlgoBenchmark();
             re.sort(a);
            for(int i:a){
            System.out.print(i);
            System.out.print(" ");
              }
		    duration = System.nanoTime() - startTime;
			System.out.println("\n The time duration in millisecond is = " + duration/1000000);

			 break;
			 
	 case 5:System.out.println("Merge Sort ");
	      startTime = System.nanoTime();
		  sortingAlgoBenchmark mms = new sortingAlgoBenchmark();
            mms.Sort(a);
            for(int i:a){
            System.out.print(i);
            System.out.print("  ");
			}

		    duration = System.nanoTime() - startTime;
			System.out.println("\n The time duration in millisecond is = " + duration/1000000);

			 break;
			
			
	 case 6:System.out.println("Heap Sort");
	      startTime = System.nanoTime();
		  sortingAlgoBenchmark.Sort1(a);
          for(int i:a){
            System.out.print(i);
            System.out.print(" ");
	     	}

		    duration = System.nanoTime() - startTime;
			System.out.println("\n The time duration in millisecond is = " + duration/1000000);

			 break;
			 
	 case 7: System.out.println("Bench Mark All");
	         System.out.println("\n ************************************");
	         System.out.println("Bubble Sort");
	          startTime = System.nanoTime();
	         sortingAlgoBenchmark.bubble_srt(a);
			   for(int i=1;i<a.length;i++)
		       System.out.print(a[i] + " ");
		       System.out.println("\n");
			    
			System.out.println("Selection Sort");
	        sortingAlgoBenchmark.SelectionSort(a);
	            for(int i=1;i<a.length;i++)
		        System.out.print(a[i] + " ");
			    System.out.println("\n");
			   
             System.out.println("Insertion Sort");
	         sortingAlgoBenchmark.InsertionSort(a);
	           for(int i=1;i<a.length;i++)
		        System.out.print(a[i] + " ");
			    System.out.println("\n");
			   
			System.out.println("Quick Sort");
	        sortingAlgoBenchmark  rest=new sortingAlgoBenchmark();
            rest.sort(a);
            for(int i:a){
            System.out.print(i);
            System.out.print(" ");
              }
			  System.out.println("\n");
		 		 
	      System.out.println("Merge Sort ");
	      
		  sortingAlgoBenchmark mm = new sortingAlgoBenchmark();
            mm.Sort(a);
            for(int i:a){
            System.out.print(i);
            System.out.print("  ");
			}
			System.out.println("\n");
			
			System.out.println("Heap Sort");
	      
		    sortingAlgoBenchmark.Sort1(a);
            for(int i:a){
            System.out.print(i);
            System.out.print(" ");
	     	}
             
			  duration = System.nanoTime() - startTime;
			  System.out.println("\n The time duration in millisecond is = " + duration/1000000);
               break;			 
			
	 case 8: System.out.println("Start Over");
	         
			 break;
	 case 9: System.out.println("Exit");
	         System.exit(0);
	         break;	 
			}
	}
}
