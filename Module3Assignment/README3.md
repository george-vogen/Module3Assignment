<h2>Venn Diagram Utility Class</h2>
<p>A <a class="instructure_file_link inline_disabled" href="https://en.wikipedia.org/wiki/Venn_diagram" target="_blank" rel="noopener">Venn diagram</a> uses overlapping circles to display the relationships between elements in a set.</p>
<h3>Requirements</h3>
<p><span>Accept and clone the <span style="font-size: 12pt;">assignment</span> from GitHub Classroom using the following link:&nbsp;</span></p>
<p>Create a class named VennDiagram that will represent a Venn diagram with three circles. The class should have a generic type T.</p>
<p>Fields</p>
<ul>
    <li>Three Strings that will contain the labels of the three circles</li>
    <li>Three Sets (also of type T) that will contain the contents of the circles</li>
</ul>
<p>Methods</p>
<table style="border-collapse: collapse; width: 98.1164%;" border="1">
    <tbody>
        <tr>
            <td style="width: 13.0347%; text-align: center;">A<strong>ccess Specifier</strong></td>
            <td style="width: 11.1664%; text-align: center;"><strong>Return Type</strong></td>
            <td style="width: 15.3914%; text-align: center;"><strong>Name</strong></td>
            <td style="width: 21.5747%; text-align: center;"><strong>Parameters</strong></td>
            <td style="width: 38.7456%; text-align: center;"><strong>Purpose</strong></td>
        </tr>
        <tr>
            <td style="width: 13.0347%;">public</td>
            <td style="width: 11.1664%;">--</td>
            <td style="width: 15.3914%;">VennDiagram</td>
            <td style="width: 21.5747%;">String label1, String label2, String label3</td>
            <td style="width: 38.7456%;">Constructor that assigns the three labels to the fields. It also initializes the three Set fields to empty HashSets.</td>
        </tr>
        <tr>
            <td style="width: 13.0347%;">private</td>
            <td style="width: 11.1664%;">Set&lt;T&gt;</td>
            <td style="width: 15.3914%;">getCircleForLabel</td>
            <td style="width: 21.5747%;">String label</td>
            <td style="width: 38.7456%;">Given a label, returns the associated set. (For internal use in the VennDiagram class only.)</td>
        </tr>
        <tr>
            <td style="width: 13.0347%;">public</td>
            <td style="width: 11.1664%;">void</td>
            <td style="width: 15.3914%;">add</td>
            <td style="width: 21.5747%;">T item, String... labels</td>
            <td style="width: 38.7456%;">Adds the given item to every set whose label is in the array of labels. (<a class="instructure_file_link inline_disabled" href="https://www.baeldung.com/java-varargs" target="_blank" rel="noopener">Read 1 - 4 here for more info about variable length arguments</a>)</td>
        </tr>
        <tr>
            <td style="width: 13.0347%;">public</td>
            <td style="width: 11.1664%;">Set&lt;T&gt;</td>
            <td style="width: 15.3914%;">unionOf</td>
            <td style="width: 21.5747%;">String first, String second</td>
            <td style="width: 38.7456%;">Returns all items in either the first or second set</td>
        </tr>
        <tr>
            <td style="width: 13.0347%;">public</td>
            <td style="width: 11.1664%;">Set&lt;T&gt;</td>
            <td style="width: 15.3914%;">intersectionOf</td>
            <td style="width: 21.5747%;">String first, String second</td>
            <td style="width: 38.7456%;">Returns all items in both the first and second set</td>
        </tr>
        <tr>
            <td style="width: 13.0347%;">public</td>
            <td style="width: 11.1664%;">Set&lt;T&gt;</td>
            <td style="width: 15.3914%;">complementOf</td>
            <td style="width: 21.5747%;">String first, String second</td>
            <td style="width: 38.7456%;">Returns all items in the first set that are NOT also in the second set</td>
        </tr>
        <tr>
            <td style="width: 13.0347%;">public</td>
            <td style="width: 11.1664%;">Set&lt;T&gt;</td>
            <td style="width: 15.3914%;">diagramCenter</td>
            <td style="width: 21.5747%;">--</td>
            <td style="width: 38.7456%;">Returns the items in the center of the diagram</td>
        </tr>
    </tbody>
</table>
<p>&nbsp;</p>
<h3>Main Class for Testing</h3>
<p>Test your VennDiagram class by running this Main class.</p>
<pre><span>package </span>edu.wctc<span>;<br /></span><span><br /></span><span>public class </span>Main <span>{<br /></span><span><br /></span>    <span>public static void </span><span>main</span><span>(</span>String<span>[] </span>args<span>) {<br /></span>        String carby = <span>"carby"</span><span>;<br /></span>        String tomatoey = <span>"tomatoey"</span><span>;<br /></span>        String cheesy = <span>"cheesy"</span><span>;<br /></span><span><br /></span>        VennDiagram<span>&lt;</span>String<span>&gt; </span>foodDiagram = <span>new </span>VennDiagram<span>&lt;&gt;(</span>carby<span>, </span>tomatoey<span>, </span>cheesy<span>)</span><span>;<br /></span><span><br /></span>        foodDiagram.add<span>(</span><span>"Croissant"</span><span>, </span>carby<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Roll"</span><span>, </span>carby<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Toast"</span><span>, </span>carby<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Grilled Cheese"</span><span>, </span>carby<span>, </span>cheesy<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Mac and Cheese"</span><span>, </span>carby<span>, </span>cheesy<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Cheese and Crackers"</span><span>, </span>carby<span>, </span>cheesy<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Bagel and Cream Cheese"</span><span>, </span>carby<span>, </span>cheesy<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Spaghetti Marinara"</span><span>, </span>carby<span>, </span>tomatoey<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Tomato Sandwich"</span><span>, </span>carby<span>, </span>tomatoey<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Lasagna"</span><span>, </span>carby<span>, </span>tomatoey<span>, </span>cheesy<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Tomato Soup and Goldfish Crackers"</span><span>, </span>carby<span>, </span>tomatoey<span>, </span>cheesy<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Pizza Margherita"</span><span>, </span>carby<span>, </span>tomatoey<span>, </span>cheesy<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Tomato and Mozzarella Sandwich"</span><span>, </span>carby<span>, </span>tomatoey<span>, </span>cheesy<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Tomato Slices"</span><span>, </span>tomatoey<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Tomato Wedges"</span><span>, </span>tomatoey<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Grape Tomatoes"</span><span>, </span>tomatoey<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Caprese Salad"</span><span>, </span>tomatoey<span>, </span>cheesy<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Greek Salad"</span><span>, </span>tomatoey<span>, </span>cheesy<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Mozzarella Sticks"</span><span>, </span>cheesy<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"String Cheese"</span><span>, </span>cheesy<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Cheese Cubes"</span><span>, </span>cheesy<span>)</span><span>;<br /></span>        foodDiagram.add<span>(</span><span>"Fresh Mozzarella"</span><span>, </span>cheesy<span>)</span><span>;<br /></span><span><br /></span>        <span>// carby OR tomatoey<br /></span>        System.<span>out</span>.println<span>(</span>foodDiagram.unionOf<span>(</span>carby<span>, </span>tomatoey<span>))</span><span>;<br /></span>        <span>// tomatoey AND cheesy<br /></span>        System.<span>out</span>.println<span>(</span>foodDiagram.intersectionOf<span>(</span>tomatoey<span>, </span>cheesy<span>))</span><span>;<br /></span>        <span>// cheesy but NOT carby<br /></span>        System.<span>out</span>.println<span>(</span>foodDiagram.complementOf<span>(</span>cheesy<span>, </span>carby<span>))</span><span>;<br /></span>        <span>// all three<br /></span>        System.<span>out</span>.println<span>(</span>foodDiagram.diagramCenter<span>())</span><span>;<br /></span>    <span>}<br /></span><span>}</span></pre>
<p>&nbsp;</p>
<p>Expected output is:</p>
<pre>[Tomato Sandwich, Pizza Margherita, Tomato and Mozzarella Sandwich, Croissant, Grape Tomatoes, Mac and Cheese, Caprese Salad, Greek Salad, Tomato Wedges, Cheese and Crackers, Grilled Cheese, Bagel and Cream Cheese, Tomato Soup and Goldfish Crackers, Toast, Lasagna, Spaghetti Marinara, Roll, Tomato Slices]<br />[Tomato Soup and Goldfish Crackers, Pizza Margherita, Tomato and Mozzarella Sandwich, Lasagna, Caprese Salad, Greek Salad]<br />[Caprese Salad, Mozzarella Sticks, Cheese Cubes, Greek Salad, String Cheese, Fresh Mozzarella]<br />[Pizza Margherita, Tomato and Mozzarella Sandwich, Tomato Soup and Goldfish Crackers, Lasagna]</pre>
<p>&nbsp;</p>
<h3>Modify the Main Class</h3>
<p>Once your VennDiagram class is working, create a second instance that accepts integers. Add the numbers 1 though 10 into the sets <em><a class="instructure_file_link inline_disabled" href="https://www.mathsisfun.com/numbers/even-odd.html" target="_blank" rel="noopener">evens</a>, <a class="instructure_file_link inline_disabled" href="https://www.mathsisfun.com/prime-composite-number.html" target="_blank" rel="noopener">primes</a>, and <a class="instructure_file_link inline_disabled" href="https://www.mathsisfun.com/numbers/fibonacci-sequence.html" target="_blank" rel="noopener">Fibonnacis</a></em>.</p>
<p>Use the set operations of the diagram to print out the following:</p>
<ul>
    <li>Numbers that are either prime <strong>or</strong> even</li>
    <li>Numbers that are both prime&nbsp;<strong>and</strong> Fibonacci</li>
    <li>Odd Fibonacci numbers</li>
    <li>Numbers that are even&nbsp;<strong>and</strong> prime&nbsp;<strong>and</strong> Fibonacci</li>
</ul>