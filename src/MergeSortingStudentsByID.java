
public class MergeSortingStudentsByID {

    public static Student[] mergeSort(Student[] a, int n) {
        if (n < 2) {
            return a;
        }
        if (a == null) return null;
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        return merge(a, l, r, mid, n - mid);
    }
    public static Student[] mergeSort(Student[] a, Student[] b) {
        int n = a.length + b.length;
        Student[] c = new Student[n];
        int i;
        for (i = 0; i < a.length + b.length; i++)
            if (i < a.length) c[i] = a[i];
            else c[i] = b[i- a.length];
        return mergeSort(c, n);
    }
    public static Student[] merge(
        Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].getIDNumber() <= r[j].getIDNumber()) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
        return a;
    }
}
