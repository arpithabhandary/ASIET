#include<stdio.h>
#include<string.h>
typedef struct process{
	int pid;
	char p[10];
	int AT;
	int BT;
}fcfs;

void getprocess(fcfs p[100],int n)
	{
	int i;
	for(i=0;i<n;i++){
	printf("enter the %d Process PID",i+1);
	scanf("%d",&p[i].pid);
	printf("Enter the arrival time ");
	scanf("%d",&p[i].AT);
	printf("enter the Burst Time");
	scanf("%d",&p[i].BT);
	}
}
void sort(struct process p[100],int n)
{struct process temp;
 	
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
	if(p[j].AT>p[j+1].AT){
		temp=p[j];
		p[j]=p[j+1];
		p[j+1]=temp;
		}
	
	}
}

}
void printsortedprocesses(struct process p[100],int n){
printf("PID\tArrivalTime\tBurstTime\n");
for(int i=0;i<n;i++){
printf("%d\t%d\t\t%d\n",p[i].pid,p[i].AT,p[i].BT);
}
}
int main(){
int n;
printf("ente the no of processcor");
scanf("%d",&n);
struct process p[100];
getprocess(p,n);
sort(p,n);
printsortedprocesses(p,n);
return 0;
}
