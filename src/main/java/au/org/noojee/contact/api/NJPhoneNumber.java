package au.org.noojee.contact.api;

public class NJPhoneNumber
{

	String phoneNumber;
	
	public NJPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
		
	}
	
    // for gson.
    public NJPhoneNumber()
    {
    }

    
    @Override
    public String toString()
    {
        if (phoneNumber != null) {
            return this.phoneNumber.trim().replaceAll(" ", "");
        } else {
            return "";
        }
    }

	public String compactString()
	{
        if (phoneNumber != null) {
            return this.phoneNumber.trim().replaceAll(" ", "");
        } else {
            return "";
        }
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NJPhoneNumber other = (NJPhoneNumber) obj;
		if (phoneNumber == null)
		{
			if (other.phoneNumber != null)
				return false;
		}
		else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}

}
