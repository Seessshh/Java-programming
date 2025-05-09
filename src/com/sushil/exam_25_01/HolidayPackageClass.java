package com.sushil.exam_25_01;

public class HolidayPackageClass implements HolidayPackage
{
    private String packageName;
    private int totalSeats;
    private int availableSeats;

    public HolidayPackageClass(String packageName, int totalSeats, int availableSeats) {
        this.packageName = packageName;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public void reserveSeats(int seats)
    {
        try
        {
            if (this.packageName != packageName)
            {
                throw new InvalidPackageException("invalid input");
            }
            if(seats > this.availableSeats)
            {
                throw new InsufficientSeatsException("insufficient seats");
            }
        }
        catch (InsufficientSeatsException e)
        {

        }
        catch (InvalidPackageException e)
        {

        }
    }

    @Override
    public int getAvailableSeats()
    {
        return this.availableSeats;
    }
}
