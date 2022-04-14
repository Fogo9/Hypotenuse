# **Area of Triangle**

# Information

* **You can find the area of ​​the triangle by determining the side lengths.**

# Technologies Used

* **JAVA**

# Contents

* Hypotenuse class was defined.

* The side lengths and environment variables of the triangle are created.

* The variable 'area' is defined with double.

* Scanner scan class defined.

* A program has been developed that can be calculated by taking the value from the user.

* The area formula was used to define the area.



```Java

public class hypotenuse {

    public static void main(String[] args) {

        int a, b, c, u;

        double area;

        Scanner scan = new Scanner(System.in);

```

```Java

        System.out.print("Side 1 : ");

        a = scan.nextInt();

        System.out.print("Side 2 : ");

        b = scan.nextInt();

        System.out.print("Side 3 : ");

        c = scan.nextInt();


```
```Java

        u = (a + b + c) / 2;

        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.print("Area of Triangle : " + area);
```

```bash

        Side 1 : 8
        Side 2 : 10
        Side 3 : 12
        Area of Triangle : 39.68626966596886

```
<br />

# LINK

* Click here https://github.com/Fogo9/Hypotenuse.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
