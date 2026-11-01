//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

        //System.out.println(" ");
        //System.out.println("The Universal Cataloging Constant is currently set to: " + artifact.UCC_VALUE);

        artifact test1 = new artifact();
        test1.artEnergy = 30;
        test1.name = "Golden Artifact";
        String UCCForm = String.format("%.3f", artifact.UCC_VALUE);
        //System.out.println(" ");
        //System.out.println("The stability index of the " + test1.name + " is " + Utility.StaInd(artifact.UCC_VALUE, test1.artEnergy));

        //System.out.println(" ");
        //System.out.println("There are currently " + artifact.artCount + " artifacts.");

        System.out.println(" ");
        System.out.println("----------Archive Report----------");
        System.out.println("Artifacts in the Archive: " + artifact.artCount);
        System.out.println("The current Universal Cataloging Constant is currently: " + UCCForm);
        System.out.println("The current system energy is: " + Double.parseDouble(artifact.SysEnergy));

}
