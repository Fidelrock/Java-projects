#include<stdio.h>
int main(int argc, char** argv)
{
	int n;
	int i;
	int j;
	do
	{
	printf("ENTER DIMENSION: \n");
	scanf("%d",&n);
	
	if(n<=0)
	{ 
	printf("The dimension must be greater than 0\n");
	}
	}
	while(n<=0);

  printf("%5s","X");
for(i=1; i<=n; i++)
{
	printf("%5d", i);
	
}
    printf("\n");
	for(i=1; i<=n; i++)
	{
		printf("%5d", i);
		for(j=1; j<=n; j++)
		{
			printf("%5d",i*j);
		}
		printf("\n");
	}
	return 0;
}