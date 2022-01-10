synchronized(this)
        {
            System.out.print("Thread: Elements from "+i+" to "+(j-1));
            for(;i<j;i++)
                sum += a[i];

            System.out.println(" => Sum : "+sum);
        }
        