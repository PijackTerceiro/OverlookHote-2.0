package OverlookPackage;

import java.io.Serializable;

public class Date extends java.util.Date implements Serializable
{
  private int day, month, year;

  public Date()
  {
    month = month-1;
    year = year-1900;
  }
  public Date(int day, int month, int year)
  {
    this.day = day;
    this.month = month-1;
    this.year = year-1900;
  }

  public void setDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month-1;
    this.year = year-1900;
  }
  public void setDay(int day)
  {
    this.day = day;
  }

  public void setMonth(int month)
  {
    this.month = month-1;
  }

  public void setYear(int year)
  {
    this.year = year-1900;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public Date copy()
  {
    return new Date(day, month, year);
  }

  public boolean equals(Date obj)
  {
    return obj.getDay() == day && obj.getMonth() == month
        && obj.getYear() == year;
  }

  public String toString()
  {
    return day + "/" + month + "/" + year;
  }
}

