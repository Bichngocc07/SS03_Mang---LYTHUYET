public class SS03_Bai6 {
public static int[] mergeBooks(int[] a, int[] b) {
int[] temp = new int[a.length + b.length];
int i = 0, j = 0, k = 0;

while (i < a.length && j < b.length) {
int value;

if (a[i] < b[j]) {
value = a[i];
i++;
} else if (a[i] > b[j]) {
value = b[j];
j++;
} else {
value = a[i];
i++;
j++;
}

  if (k == 0 || temp[k - 1] != value) {
  temp[k] = value;
  k++;
  }
  }

        
  while (i < a.length) {
  int value = a[i];
  i++;
  if (k == 0 || temp[k - 1] != value) {
  temp[k] = value;
  k++;
  }
  }
      
  while (j < b.length) {
  int value = b[j];
  j++;
  if (k == 0 || temp[k - 1] != value) {
  temp[k] = value;
  k++;
  }
  }
     
int[] result = new int[k];
for (int t = 0; t < k; t++) {
result[t] = temp[t];
}
  return result;
}


public static void display(int[] arr) {
System.out.print("[");
for (int i = 0; i < arr.length; i++) {
System.out.print(arr[i]);
if (i < arr.length - 1) System.out.print(", ");
      }
      System.out.print("]");
  }

public static void main(String[] args) {
    int[] arrayFirst = {1, 3, 5, 7, 9};
    int[] arraySecond = {2, 3, 5, 6, 8, 9, 10};

    System.out.print("Kho cũ: ");
    display(arrayFirst);

    System.out.print("\nLô mới: ");
    display(arraySecond);

    int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);

    System.out.print("\nKho tổng (đã gộp & lọc trùng): ");
    display(arrayMerge);
    }
}
