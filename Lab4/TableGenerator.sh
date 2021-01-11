#!/bin/bash
printf "Iterations O(1)push O(1)pop\tO(N)push\tO(N)pop\n" > report.txt
echo "-------------------------------------------------------" >> report.txt

base=1000

for i in `seq 0 6`; do
   mult=$((2**$i))
   n=$(($base*$mult))
   printf $mult >> report.txt
   printf "n\t    " >> report.txt 
   printf "%.*f" 0 $(java StackTime push 1 $n) >> report.txt

   printf "ns    " >> report.txt
   printf "%.*f" 0 $(java StackTime pop 1 $n) >> report.txt

   printf "ns\t" >> report.txt
   printf "%.*f" 0 $(java StackTime push N $n) >> report.txt

   printf "ns\t\t" >> report.txt
   printf "%.*f" 0 $(java StackTime pop N $n) >> report.txt
   
   printf "ns\n" >> report.txt
done
