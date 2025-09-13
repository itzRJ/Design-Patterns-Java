package creational.factory.simplefactory;

import creational.factory.button.Button;
import creational.factory.button.PlatformType;
import creational.factory.button.RectagularButton;
import creational.factory.button.RoundButton;

//Step 3: create factory classes
public class ButtonFactory {

    /**
     * Step 4: create a static factory method
     * @param platformType platform type
     * @return respective button object
     *
     * This factory method violates the SRP and OCP violations, but this will be at library level
     */
    public static Button createButton(PlatformType platformType)
    {
        switch (platformType)
        {
            case ANDROID :
                return new RectagularButton();
            case iOS :
                return new RoundButton();
        }

        throw new RuntimeException("Invalid platform type");
    }
}
