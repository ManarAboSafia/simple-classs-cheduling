
package SimpleClassScheduling;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static ArrayList<student_informathion> student = new ArrayList();
    static ArrayList<course_informathion> course = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        System.out.println("Welcome");
        for (int i = 0; i < 80; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("a.Create Schedule form."
                + "\nb.Display Schedule form."
                + "\nc.Modify Schedule form."
                + "\nd.Delete Schedule form."
                + "\ne.Exit.");

        Scanner input = new Scanner(System.in);
        String whatinput = input.nextLine();
        for (int i = 0; i < 80; i++) {
            System.out.print("-");
        }
        System.out.println();
        switch (whatinput) {
            case "a":
                int[] dayselect = new int[3];
                System.out.println("Enter First Name : ");
                String first_name = input.nextLine();
                System.out.println("Enter Last Name : ");
                String last_name = input.nextLine();
                System.out.println("Enter Student ID : ");
                int student_id = Integer.parseInt(input.nextLine());
                System.out.println("Enter Student Level : ");
                int student_level = Integer.parseInt(input.nextLine());
                System.out.println("Enter Student Collage : ");
                String student_collage = input.nextLine();
                student_informathion std = new student_informathion(first_name, last_name, student_collage, student_id, student_level);
                student.add(std);

                boolean loop;
                do {

                    System.out.println("Enter Course Name : ");
                    String course_name = input.nextLine();
                    System.out.println("Enter Course Number : ");
                    int course_number = Integer.parseInt(input.nextLine());
                    System.out.println("Enter Course Hall : ");
                    String course_hall = input.nextLine();
                    System.out.println("Enter Course Teacher : ");
                    String course_teacher = input.nextLine();
                    for (int i = 0; i < 80; i++) {
                        System.out.print("-");
                    }
                    System.out.println();
                    System.out.println("1-create\n2-cancel");
                    int choose = input.nextInt();
                    if (choose == 1) {
                        boolean conﬁrmation = true;
                        for (conﬁrmation = false; conﬁrmation != true;) {

                            for (int i = 0; i < 80; i++) {
                                System.out.print("-");
                            }
                            System.out.println();
                            String[] day = new String[7];
                            day[0] = "Sat";
                            day[1] = "Sun";
                            day[2] = "Mon";
                            day[3] = "Tue";
                            day[4] = "Wed";
                            day[5] = "Thu";
                            day[6] = "Fri";

                            System.out.println("Select course days");
                            for (int i = 0; i < day.length; i++) {
                                System.out.print((i + 1 + "-") + day[i] + "   ");
                            }
                            System.out.println();
                            dayselect[0] = input.nextInt();
                            for (int i = 0; i < day.length; i++) {
                                System.out.print((i + 1 + "-") + day[i] + "   ");
                            }
                            System.out.println();
                            dayselect[1] = input.nextInt();
                            System.out.println("If you need only tow days enter 0");
                            for (int i = 0; i < day.length; i++) {
                                System.out.print((i + 1 + "-") + day[i] + "   ");
                            }
                            System.out.println();
                            dayselect[2] = input.nextInt();
                            boolean unsualday = true;
                            for (int i = 0; i < dayselect.length; i++) {
                                if (dayselect[i] == 7 || dayselect[i] == 6) {
                                    unsualday = false;

                                }
                            }
                            if (unsualday == false) {
                                System.out.println("This day is unusual lectures days,Ary you sure?\n1-Yes\n2-No");
                                int conﬁrm = input.nextInt();
                                if (conﬁrm == 1) {
                                    conﬁrmation = true;
                                }
                            } else {
                                conﬁrmation = true;

                            }
                            boolean error = false;
                            do {

                                System.out.println("Select course Time");
                                System.out.println("1-(8-9) 2-(9-10)    3-(10-11)   4-(12-1)    5-(1-2) 6-(2-3) 7-(3-4)");
                                int timechose = input.nextInt();
                                course_informathion coursee;
                                boolean chek;
                                switch (timechose) {
                                    case 1:
                                        chek = searceCourse(course, "8-9", student_id);
                                        if (chek == true) {
                                            coursee = new course_informathion(course_name, course_number,
                                                    course_hall, course_teacher,
                                                    dayselect, "8-9", student_id);
                                            course.add(coursee);
                                            error = false;
                                        } else {
                                            System.out.println("You have course in this time ,please select anouter cource time.");
                                            error = true;
                                        }

                                        break;
                                    case 2:
                                        chek = searceCourse(course, "9-10", student_id);
                                        if (chek == true) {
                                            coursee = new course_informathion(course_name, course_number,
                                                    course_hall, course_teacher,
                                                    dayselect, "9-10", student_id);
                                            course.add(coursee);
                                            error = false;

                                        } else {
                                            System.out.println("You have course in this time ,please select anouter cource time.");
                                            error = true;

                                        }
                                        break;
                                    case 3:
                                        chek = searceCourse(course, "10-11", student_id);
                                        if (chek == true) {
                                            coursee = new course_informathion(course_name, course_number,
                                                    course_hall, course_teacher,
                                                    dayselect, "10-11", student_id);
                                            course.add(coursee);
                                            error = false;
                                        } else {
                                            System.out.println("You have course in this time ,please select anouter cource time.");
                                            error = true;
                                        }
                                        break;
                                    case 4:
                                        chek = searceCourse(course, "12-1", student_id);
                                        if (chek == true) {
                                            coursee = new course_informathion(course_name, course_number,
                                                    course_hall, course_teacher,
                                                    dayselect, "12-1", student_id);
                                            course.add(coursee);
                                            error = false;
                                        } else {
                                            System.out.println("You have course in this time ,please select anouter cource time.");
                                            error = true;
                                        }
                                        break;
                                    case 5:
                                        chek = searceCourse(course, "1-2", student_id);
                                        if (chek == true) {
                                            coursee = new course_informathion(course_name, course_number,
                                                    course_hall, course_teacher,
                                                    dayselect, "1-2", student_id);
                                            course.add(coursee);
                                            error = false;
                                        } else {
                                            System.out.println("You have course in this time ,please select anouter cource time.");
                                            error = true;
                                        }
                                        break;
                                    case 6:
                                        chek = searceCourse(course, "2-3", student_id);
                                        if (chek == true) {
                                            coursee = new course_informathion(course_name, course_number,
                                                    course_hall, course_teacher,
                                                    dayselect, "2-3", student_id);
                                            course.add(coursee);
                                            error = false;
                                        } else {
                                            System.out.println("You have course in this time ,please select anouter cource time.");
                                            error = true;
                                        }
                                        break;
                                    case 7:
                                        chek = searceCourse(course, "3-4", student_id);
                                        if (chek == true) {
                                            coursee = new course_informathion(course_name, course_number,
                                                    course_hall, course_teacher,
                                                    dayselect, "3-4", student_id);
                                            course.add(coursee);
                                            error = false;
                                        } else {
                                            System.out.println("You have course in this time ,please select anouter cource time.");
                                            error = true;

                                        }
                                        break;
                                }
                            } while (error == true);

                        }

                    } else {
                        main(args);
                    }
                    System.out.println("Do you want to enter a new course?\n1-Yes\n2-No");
                    int a = input.nextInt();

                    if (a == 1) {
                        loop = true;

                    } else {
                        loop = false;
                    }

                } while (loop);
                main(args);
                break;
            case "b":

                System.out.println("Enter ID for student you want to display.");
                int Id = input.nextInt();
                display( Id, args);
                break;
            case "c":
                System.out.println("Enter Course Name For Modify");
                String namecourse = input.nextLine();
                int index = searcecourse(course, namecourse);
                if (index == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.println("1-Modify Time");
                    System.out.println("2-Modify Days of Course");
                    int modify = input.nextInt();
                    if (modify == 1) {
                        boolean error = false;
                        do {
                            System.out.println("Enter A New course Time");
                            System.out.println("Enter ID for student.");
                            int Idd = input.nextInt();

                            System.out.println("1-(8-9) 2-(9-10)    3-(10-11)   4-(12-1)    5-(1-2) 6-(2-3) 7-(3-4)");
                            int timechose = input.nextInt();

                            boolean chek;
                            switch (timechose) {
                                case 1:
                                    chek = searceCourse(course, "8-9", Idd);
                                    if (chek == true) {
                                        course.get(index).setTime("8-9");
                                        error = false;
                                    } else {
                                        System.out.println("You have course in this time ,please select anouter cource time.");
                                        error = true;
                                    }
                                    break;
                                case 2:
                                    chek = searceCourse(course, "9-10", Idd);
                                    if (chek == true) {
                                        course.get(index).setTime("9-10");

                                        error = false;
                                    } else {
                                        System.out.println("You have course in this time ,please select anouter cource time.");
                                        error = true;
                                    }
                                    break;
                                case 3:
                                    chek = searceCourse(course, "10-11", Idd);
                                    if (chek == true) {
                                        course.get(index).setTime("10-11");
                                        error = false;
                                    } else {
                                        System.out.println("You have course in this time ,please select anouter cource time.");
                                        error = true;
                                    }
                                    break;
                                case 4:
                                    chek = searceCourse(course, "12-1", Idd);
                                    if (chek == true) {
                                        course.get(index).setTime("12-1");
                                        error = false;
                                    } else {
                                        System.out.println("You have course in this time ,please select anouter cource time.");
                                        error = true;
                                    }
                                    break;
                                case 5:
                                    chek = searceCourse(course, "1-2", Idd);
                                    if (chek == true) {
                                        course.get(index).setTime("1-2");
                                        error = false;
                                    } else {
                                        System.out.println("You have course in this time ,please select anouter cource time.");
                                        error = true;
                                    }
                                    break;
                                case 6:
                                    chek = searceCourse(course, "2-3", Idd);
                                    if (chek == true) {
                                        course.get(index).setTime("2-3");
                                        error = false;
                                    } else {
                                        System.out.println("You have course in this time ,please select anouter cource time.");
                                        error = true;
                                    }
                                    break;
                                case 7:
                                    chek = searceCourse(course, "3-4", Idd);
                                    if (chek == true) {
                                        course.get(index).setTime("3-4");
                                        error = false;
                                    } else {
                                        System.out.println("You have course in this time ,please select anouter cource time.");
                                        error = true;
                                    }
                                    break;
                            }
                        } while (error == true);
                        display( course.get(index).getID(), args);
                    } else if (modify == 2) {
                        boolean conﬁrmation;
                        for (conﬁrmation = false; conﬁrmation != true;) {

                            for (int i = 0; i < 80; i++) {
                                System.out.print("-");
                            }
                            System.out.println();
                            String[] day = new String[7];
                            day[0] = "Sat";
                            day[1] = "Sun";
                            day[2] = "Mon";
                            day[3] = "Tue";
                            day[4] = "Wed";
                            day[5] = "Thu";
                            day[6] = "Fri";

                            System.out.println("Enter A New course days");
                            int[] daynew = new int[3];

                            for (int i = 0; i < day.length; i++) {
                                System.out.print((i + 1 + "-") + day[i] + "   ");
                            }
                            System.out.println();
                            daynew[0] = input.nextInt();
                            for (int i = 0; i < day.length; i++) {
                                System.out.print((i + 1 + "-") + day[i] + "   ");
                            }
                            System.out.println();
                            daynew[1] = input.nextInt();
                            System.out.println("If you need only tow days enter 0");
                            for (int i = 0; i < day.length; i++) {
                                System.out.print((i + 1 + "-") + day[i] + "   ");
                            }
                            System.out.println();
                            daynew[2] = input.nextInt();
                            boolean unsualday = true;
                            for (int i = 0; i < daynew.length; i++) {
                                if (daynew[i] == 7 || daynew[i] == 6) {
                                    unsualday = false;

                                }
                            }
                            if (unsualday == false) {
                                System.out.println("This day is unusual lectures days,Ary you sure?\n1-Yes\n2-No");
                                int conﬁrm = input.nextInt();
                                if (conﬁrm == 1) {
                                    conﬁrmation = true;
                                }
                            } else {
                                conﬁrmation = true;

                            }
                            course.get(index).setDay(daynew);

                        }
                        display( course.get(index).getID(), args);

                    }
                }
                main(args);
                break;

            case "d":
                System.out.println("Enter ID Student For Deleting.");
                int ID = input.nextInt();
                display( ID);
                System.out.println("Are You sure to delete schedule?\n1-Yes\n2-No");
                int confirm = input.nextInt();
                if (confirm == 1) {
                    int[] dayselectt = new int[3];
                    ArrayList<Integer> schedule = searceCourse(course, ID);
                   
                     for (Integer schedule1 : schedule)  {
                       Delete(schedule1);
                    }
                    System.out.println("Do you want to Enter  a new student?\n1-Yes\n2-No");
                    int confierm = input.nextInt();
                    if (confierm == 1) {
                        boolean looop;
                        do {
                            System.out.println("Enter ID Student: ");
                            int ID_Std = input.nextInt();
                            System.out.println("Enter Course Name : ");
                            String course_name = input.nextLine();
                            System.out.println("Enter Course Number : ");
                            int course_number = Integer.parseInt(input.nextLine());
                            System.out.println("Enter Course Hall : ");
                            String course_hall = input.nextLine();
                            System.out.println("Enter Course Teacher : ");
                            String course_teacher = input.nextLine();
                            for (int i = 0; i < 80; i++) {
                                System.out.print("-");
                            }
                            System.out.println();
                            System.out.println("1-create\n2-cancel");
                            int choose = input.nextInt();
                            if (choose == 1) {
                                boolean conﬁrmation = true;
                                for (conﬁrmation = false; conﬁrmation != true;) {

                                    for (int i = 0; i < 80; i++) {
                                        System.out.print("-");
                                    }
                                    System.out.println();
                                    String[] day = new String[7];
                                    day[0] = "Sat";
                                    day[1] = "Sun";
                                    day[2] = "Mon";
                                    day[3] = "Tue";
                                    day[4] = "Wed";
                                    day[5] = "Thu";
                                    day[6] = "Fri";

                                    System.out.println("Select course days");
                                    for (int i = 0; i < day.length; i++) {
                                        System.out.print((i + 1 + "-") + day[i] + "   ");
                                    }
                                    System.out.println();
                                    dayselectt[0] = input.nextInt();
                                    for (int i = 0; i < day.length; i++) {
                                        System.out.print((i + 1 + "-") + day[i] + "   ");
                                    }
                                    System.out.println();
                                    dayselectt[1] = input.nextInt();
                                    System.out.println("If you need only tow days enter 0");
                                    for (int i = 0; i < day.length; i++) {
                                        System.out.print((i + 1 + "-") + day[i] + "   ");
                                    }
                                    System.out.println();
                                    dayselectt[2] = input.nextInt();
                                    boolean unsualday = true;
                                    for (int i = 0; i < dayselectt.length; i++) {
                                        if (dayselectt[i] == 7 || dayselectt[i] == 6) {
                                            unsualday = false;

                                        }
                                    }
                                    if (unsualday == false) {
                                        System.out.println("This day is unusual lectures days,Ary you sure?\n1-Yes\n2-No");
                                        int conﬁrm = input.nextInt();
                                        if (conﬁrm == 1) {
                                            conﬁrmation = true;
                                        }
                                    } else {
                                        conﬁrmation = true;

                                    }
                                    boolean error = false;
                                    do {

                                        System.out.println("Select course Time");
                                        System.out.println("1-(8-9) 2-(9-10)    3-(10-11)   4-(12-1)    5-(1-2) 6-(2-3) 7-(3-4)");
                                        int timechose = input.nextInt();
                                        course_informathion coursee;
                                        boolean chek;
                                        switch (timechose) {
                                            case 1:
                                                chek = searceCourse(course, "8-9", ID_Std);
                                                if (chek == true) {
                                                    coursee = new course_informathion(course_name, course_number,
                                                            course_hall, course_teacher,
                                                            dayselectt, "8-9", ID_Std);
                                                    course.add(coursee);
                                                    error = false;
                                                } else {
                                                    System.out.println("You have course in this time ,please select anouter cource time.");
                                                    error = true;
                                                }

                                                break;
                                            case 2:
                                                chek = searceCourse(course, "9-10", ID_Std);
                                                if (chek == true) {
                                                    coursee = new course_informathion(course_name, course_number,
                                                            course_hall, course_teacher,
                                                            dayselectt, "9-10", ID_Std);
                                                    course.add(coursee);
                                                    error = false;

                                                } else {
                                                    System.out.println("You have course in this time ,please select anouter cource time.");
                                                    error = true;

                                                }
                                                break;
                                            case 3:
                                                chek = searceCourse(course, "10-11", ID_Std);
                                                if (chek == true) {
                                                    coursee = new course_informathion(course_name, course_number,
                                                            course_hall, course_teacher,
                                                            dayselectt, "10-11", ID_Std);
                                                    course.add(coursee);
                                                    error = false;
                                                } else {
                                                    System.out.println("You have course in this time ,please select anouter cource time.");
                                                    error = true;
                                                }
                                                break;
                                            case 4:
                                                chek = searceCourse(course, "12-1", ID_Std);
                                                if (chek == true) {
                                                    coursee = new course_informathion(course_name, course_number,
                                                            course_hall, course_teacher,
                                                            dayselectt, "12-1", ID_Std);
                                                    course.add(coursee);
                                                    error = false;
                                                } else {
                                                    System.out.println("You have course in this time ,please select anouter cource time.");
                                                    error = true;
                                                }
                                                break;
                                            case 5:
                                                chek = searceCourse(course, "1-2", ID_Std);
                                                if (chek == true) {
                                                    coursee = new course_informathion(course_name, course_number,
                                                            course_hall, course_teacher,
                                                            dayselectt, "1-2", ID_Std);
                                                    course.add(coursee);
                                                    error = false;
                                                } else {
                                                    System.out.println("You have course in this time ,please select anouter cource time.");
                                                    error = true;
                                                }
                                                break;
                                            case 6:
                                                chek = searceCourse(course, "2-3", ID_Std);
                                                if (chek == true) {
                                                    coursee = new course_informathion(course_name, course_number,
                                                            course_hall, course_teacher,
                                                            dayselectt, "2-3", ID_Std);
                                                    course.add(coursee);
                                                    error = false;
                                                } else {
                                                    System.out.println("You have course in this time ,please select anouter cource time.");
                                                    error = true;
                                                }
                                                break;
                                            case 7:
                                                chek = searceCourse(course, "3-4", ID_Std);
                                                if (chek == true) {
                                                    coursee = new course_informathion(course_name, course_number,
                                                            course_hall, course_teacher,
                                                            dayselectt, "3-4", ID_Std);
                                                    course.add(coursee);
                                                    error = false;
                                                } else {
                                                    System.out.println("You have course in this time ,please select anouter cource time.");
                                                    error = true;

                                                }
                                                break;
                                        }
                                    } while (error == true);

                                }
                                display(ID_Std, args);
                            } else {
                                main(args);
                            }
                            System.out.println("Do you want to Enter a new course?\n1-Yes\n2-No");
                            int a = input.nextInt();

                            if (a == 1) {
                                looop = true;

                            } else {
                                looop = false;
                            }

                        } while (looop);
                    } else if (confierm == 2) {
                                        main(args);

                    }
                } else if (confirm == 2) {
                    main(args);
                }

                break;
            case "e":
                System.exit(0);
            default:
                main(args);
                break;
        }

    }

    private static void display(int Id, String[] args) {
        ArrayList<Integer> indexCource = searceCourse(course, Id);
        System.out.println("Course Name\tCourse Hall\tTime\tDay");
        for (Integer indexCource1 : indexCource) {
            System.out.print(course.get(indexCource.get(indexCource1)).getCourse_Name()
                    + "\t\t\t" + course.get(indexCource.get(indexCource1)).getCourse_hall()
                    + "\t" + course.get(indexCource.get(indexCource1)).getTime()
                    + "\t");
            int[] days = course.get(indexCource.get(indexCource1)).getDay();
            for (int j = 0; j < days.length; j++) {
                switch (days[j]) {
                    case 1:
                        System.out.print("Sat  ");
                        break;
                    case 2:
                        System.out.print("Sun  ");
                        break;
                    case 3:
                        System.out.print("Mon  ");
                        break;
                    case 4:
                        System.out.print("Tue  ");
                        break;
                    case 5:
                        System.out.print("Wed  ");
                        break;
                    case 6:
                        System.out.print("Thu  ");
                        break;
                    case 7:
                        System.out.print("Fri  ");
                        break;

                }

            }
            System.out.println();            
        }
        main(args);
    }

    private static void display( int Id) {
        ArrayList<Integer> indexCource = searceCourse(course, Id);
        System.out.println("Course Name\tCourse Hall\tTime\tDay");
        for (Integer indexCource1 : indexCource) {

            System.out.print(course.get(indexCource.get(indexCource1)).getCourse_Name()
                    + "\t\t\t" + course.get(indexCource.get(indexCource1)).getCourse_hall()
                    + "\t" + course.get(indexCource.get(indexCource1)).getTime()
                    + "\t");
            int[] days = course.get(indexCource.get(indexCource1)).getDay();
            for (int j = 0; j < days.length; j++) {
                switch (days[j]) {
                    case 1:
                        System.out.print("Sat  ");
                        break;
                    case 2:
                        System.out.print("Sun  ");
                        break;
                    case 3:
                        System.out.print("Mon  ");
                        break;
                    case 4:
                        System.out.print("Tue  ");
                        break;
                    case 5:
                        System.out.print("Wed  ");
                        break;
                    case 6:
                        System.out.print("Thu  ");
                        break;
                    case 7:
                        System.out.print("Fri  ");
                        break;

                }

            }
            System.out.println();
        }
    }
    
    public static int searceStudent(ArrayList<student_informathion> student, int ID) {
        for (int i = 0; i < student.size(); i++) {
            if (ID == student.get(i).getStudent_ID()) {
                return i;
            }
        }
        return -1;
    }

    public static int searcecourse(ArrayList<course_informathion> course, String Name) {
        for (int i = 0; i < course.size(); i++) {
            if (Name.equals(course.get(i).getCourse_Name())) {
                return i;
            }
        }
        return -1;
    }

    public static ArrayList<Integer> searceCourse(ArrayList<course_informathion> course, int ID) {
        ArrayList<Integer> index = new ArrayList();

        for (int i = 0; i < course.size(); i++) {
            if (ID == course.get(i).getID()) {
                index.add(i);
            }
        }
        return index;
    }

    public static boolean searceCourse(ArrayList<course_informathion> course, String time, int ID) {
        for (course_informathion course1 : course) {
            if (time.equals(course1.getTime()) && ID == course1.getID()) {
                return false;
            }
        }
        return true;
    }

    public static void Delete(int index) {
        course.remove(index);

    }
    
    
    
}
