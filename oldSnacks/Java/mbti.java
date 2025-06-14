public class MBTITest {

    static String[] questions = {
        "1. A. expend energy, enjoy groups   B. conserve energy, enjoy one-on-one",
        "2. A. interpret literally  B. look for meaning and possibilities",
        "3. A. logical, thinking, questioning  B. empathetic, feeling, accommodating",
        "4. A. organized, orderly  B. flexible, adaptable",
        "5. A. more outgoing, think out loud  B. more reserved, think to yourself",
        "6. A. practical, realistic, experiential  B. imaginative, innovative, theoretical",
        "7. A. candid, straightforward, frank  B. tactful, kind, encouraging",
        "8. A. plan, schedule  B. unplanned, spontaneous",
        "9. A. seek many tasks, interaction with others  B. seek private, quiet activities",
        "10. A. standard, conventional  B. different, unique",
        "11. A. firm, critical  B. gentle, appreciative",
        "12. A. regulated, standard  B. easy-going, flexible",
        "13. A. expressive, talkative  B. quiet, reserved",
        "14. A. focus on present  B. focus on future",
        "15. A. tough-minded  B. tender-hearted",
        "16. A. plan ahead  B. go with the flow",
        "17. A. active, energetic  B. calm, thoughtful",
        "18. A. facts, details  B. ideas, possibilities",
        "19. A. logical decisions  B. emotional decisions",
        "20. A. structured, planned  B. flexible, open-ended"
    };

	static int[][] traitGroups = {
        	{0, 4, 8, 12, 16},
        	{1, 5, 9, 13, 17},
        	{2, 6, 10, 14, 18},
        	{3, 7, 11, 15, 19}
    };

	static String[] descriptions = {
        	"ISTJ:
The Logistician (16Personalities)
The ISTJ Personality Type
ISTJ (Logistician) is a personality type with the Introverted, Observant, Thinking, and Judging traits. These people tend to be reserved yet willful, with a rational outlook on life. They compose their actions carefully and carry them out with methodical purpose.
People with the ISTJ personality type (Logisticians) mean what they say and say what they mean, and when they commit to doing something, they make sure to follow through. With their responsible and dependable nature, it might not be so surprising that ISTJ personalities also tend to have a deep respect for structure and tradition. They are often drawn to organizations, workplaces, and educational settings that offer clear hierarchies and expectations.
ISTJ personalities are also known for striving to meet their obligations no matter what. And they are often baffled by people who fail to hold themselves to the same standard. They can sometimes unfairly misjudge people who don’t match their rigorous self-control – suspecting that someone is being lazy or dishonest when that person might actually be coping with other challenges. While this can sometimes make ISTJ personalities appear rigid or unempathetic, their judgment often stems from their unwavering commitment to reliability and structure.
		",

        	"ISFJ:
The Defender (16Personalities)
The ISFJ Personality Type
ISFJ (Defender) is a personality type with the Introverted, Observant, Feeling, and Judging traits. These people tend to be warm and unassuming in their own steady way. They’re efficient and responsible, giving careful attention to practical details in their daily lives.
In their unassuming, understated way, people with the ISFJ personality type (Defenders) help make the world go round. Hardworking and devoted, these personalities feel a deep sense of responsibility to those around them. ISFJs can be counted on to meet deadlines, remember birthdays and special occasions, uphold traditions, and shower their loved ones with gestures of care and support. But they rarely demand recognition for all that they do, preferring instead to operate behind the scenes.
This is a capable, can-do personality type with a wealth of versatile gifts. Though sensitive and caring, ISFJs also have excellent analytical abilities and an eye for detail. And despite their reserve, they tend to have well-developed people skills and robust social relationships. These personalities are truly more than the sum of their parts, and their varied strengths shine in even the most ordinary aspects of their daily lives.
		",

        	"INFJ:
The Advocate(16Personalities)
The INFJ Personality Type
INFJ (Advocate) is a personality type with the Introverted, Intuitive, Feeling, and Judging traits. They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.
Idealistic and principled, people with the INFJ personality type (Advocates) aren’t content to coast through life – they want to stand up and make a difference. For these compassionate personalities, success doesn’t come from money or status but from seeking fulfillment, helping others, and being a force for good in the world.
While they have lofty goals and ambitions, INFJs shouldn’t be mistaken for idle dreamers. People with this personality type care about integrity, and they’re rarely satisfied until they’ve done what they know to be right. Conscientious to the core, they move through life with a clear sense of their values, and they aim to never lose sight of what truly matters – not according to other people or society at large but according to their own wisdom and intuition.
		",

	"INTJ:
The Architect (16Personalities)
INTJ (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits. These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. Their inner world is often a private, complex one.
People with the INTJ personality type (Architects) are intellectually curious individuals with a deep-seated thirst for knowledge. INTJs tend to value creative ingenuity, straightforward rationality, and self-improvement. They consistently work toward enhancing intellectual abilities and are often driven by an intense desire to master any and every topic that piques their interest.
Logical and quick-witted, INTJs pride themselves on their ability to think for themselves, not to mention their uncanny knack for seeing right through phoniness and hypocrisy. Because their minds are never at rest, these personalities may sometimes struggle to find people who can keep up with their nonstop analysis of everything around them. But when they do find like-minded individuals who appreciate their intensity and depth of thought, INTJs form profound and intellectually stimulating relationships that they deeply treasure.
		",

	"ISTP:
The Virtuoso (16Personalities)
ISTP (Virtuoso) is a personality type with the Introverted, Observant, Thinking, and Prospecting traits. They tend to have an individualistic mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness and personal skill, varying their approach as needed.
People with the ISTP personality type (Virtuosos) love to explore with their hands and their eyes, touching and examining the world around them with an impressive diligence, a casual curiosity, and a healthy dose of skepticism. They are natural makers, moving from project to project, building the useful and the superfluous for the fun of it and learning from their environment as they go. They find no greater joy than in getting their hands dirty pulling things apart and putting them back together, leaving them just a little bit better than they were before.
ISTPs prefer to approach problems directly, seeking straightforward solutions over convoluted troubleshooting methods. People with this personality type rely heavily on firsthand experience and trial and error as they execute their ideas and projects. And as they do so, they usually prefer to work at their own pace, on their own terms, and without unnecessary interruptions.
This is not a type who is inclined to socialize beyond what is necessary as they try to accomplish their goals. In fact, ISTP personalities generally find regular socializing to be taxing. And when they do decide to get together with people, they will almost always choose smaller, more meaningful interactions over superficial networking.
		",

	"ISFP:
The Adventurer (16Personalities)
ISFP (Adventurer) is a personality type with the Introverted, Observant, Feeling, and Prospecting traits. They tend to have open minds, approaching life, new experiences, and people with grounded warmth. Their ability to stay in the moment helps them uncover exciting potentials.
People with the ISFP personality type (Adventurers) are true artists – although not necessarily in the conventional sense. For these types, life itself is a canvas for self-expression. From what they wear to how they spend their free time, they act in ways that vividly reflect who they are as unique individuals. With their exploratory spirit and their ability to find joy in everyday life, ISFPs can be among the most interesting people you’ll ever meet.
Driven by their sense of fairness and their open-mindedness, people with this personality type move through life with an infectiously encouraging attitude. They love motivating those close to them to follow their passions and usually follow their own interests with the same unhindered enthusiasm. The only irony? Unassuming and humble, ISFPs tend to see themselves as “just doing their own thing,” so they may not even realize how remarkable they really are.
		",

	"INFP:
Healer
The Thoughtful Idealist (MBTI)
The Mediator (16Personalities)

The INFP Personality Type
INFPs are imaginative idealists, guided by their own core values and beliefs.
To a Healer, possibilities are paramount; the realism of the moment is only of passing concern. They see potential flair for better future, and pursue truth and meaning with their own individual flair.
INFPs are sensitive, caring, and compassionate, and they are deeply concerned with the personal growth of themselves and others. Individualistic and nonjudgmental, INFPs believe that each person must find their own path. They enjoy spending time exploring their own ideas and values, and are gently encouraging to others to do the same. INFPs are creative and often artistic; they enjoy finding new outlets for self-expression.
What does INFP stand for?
INFP is one of the sixteen personality types created by Katharine Briggs and Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI). INFP stands for Introversion, iNtuition, Feeling and Perceiving, which are four core personality traits based on the work of psychologist C.G. Jung.
Each of the four letters of the INFP code signifies a key personality trait of this type. INFPs are energized by time alone (Introverted), focus on ideas and concept rather than facts and details (iNtuitive), make decisions based on feeling and values(Feeling), prefer to be spontaneous and flexible rather than plannned and organized(Perceiving)
		",

	"INTP:
The Logician (16Personalities)
INTP (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits. These flexible thinkers enjoy taking an unconventional approach to many aspects of life. They often seek out unlikely paths, mixing willingness to experiment with personal creativity.
People with the INTP personality type (Logicians) pride themselves on their unique perspective and vigorous intellect. They can’t help but puzzle over the mysteries of the universe – which may explain why some of the most influential philosophers and scientists of all time have been INTPs. People with this personality type tend to prefer solitude, as they can easily become immersed in their thoughts when they are left to their own devices. They are also incredibly creative and inventive, and they are not afraid to express their novel ways of thinking or to stand out from the crowd.
		",

	"ESTP:
The Entrepreneur (16Personalities)
ESTP (Entrepreneur) is a personality type with the Extraverted, Observant, Thinking, and Prospecting traits. They tend to be energetic and action-oriented, deftly navigating whatever is in front of them. They love uncovering life’s opportunities, whether socializing with others or in more personal pursuits.
People with the ESTP personality type (Entrepreneurs) are vibrant individuals brimming with an enthusiastic and spontaneous energy. They tend to be on the competitive side, often assuming that a competitive mindset is a necessity in order to achieve success in life. With their driven, action-oriented attitudes, they rarely waste time thinking about the past. In fact, they excel at keeping their attention rooted in their present – so much so that they rarely find themselves fixated on the time throughout the day.
Theory, abstract concepts, and plodding discussions about global issues and their implications don’t keep ESTP personalities interested for long. They keep their conversations energetic, with a good dose of intelligence, but they like to talk about what is – or better yet, to just go out and do it. They often leap before they look, fixing their mistakes as they go rather than sitting idle and preparing contingencies and escape clauses.
		",

	"ESFP:
The Entertainer (16Personalities)
ESFP (Entertainer) is a personality type with the Extraverted, Observant, Feeling, and Prospecting traits. These people love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown. They can be very social, often encouraging others into shared activities.
If anyone is to be found spontaneously breaking into song and dance, it is people with the ESFP personality type (Entertainers). They get caught up in the excitement of the moment and want everyone else to feel that way too. No other type is as generous with their time and energy when it comes to encouraging others, and no other type does it with such irresistible style.
		",

	"ENFP:
The Campaigner (16Personalities)
ENFP (Campaigner) is a personality type with the Extraverted, Intuitive, Feeling, and Prospecting traits. These people tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others. Their vibrant energy can flow in many directions.
People with the ENFP personality type (Campaigners) are true free spirits – outgoing, openhearted, and open-minded. With their lively, upbeat approach to life, ENFPs stand out in any crowd. But even though they can be the life of the party, they don’t just care about having a good time. These personalities have profound depths that are fueled by their intense desire for meaningful, emotional connections with others.
		",

	"ENTP:
The Debater (16Personalities)
ENTP (Debater) is a personality type with the Extraverted, Intuitive, Thinking, and Prospecting traits. They tend to be bold and creative, deconstructing and rebuilding ideas with great mental agility. They pursue their goals vigorously despite any resistance they might encounter.
Quick-witted and audacious, people with the ENTP personality type (Debaters) aren’t afraid to disagree with the status quo. In fact, they’re not afraid to disagree with pretty much anything or anyone. Few things light up these personalities more than a bit of verbal sparring – and if the conversation veers into controversial terrain, so much the better.
It would be a mistake, though, to think of ENTPs as disagreeable or mean-spirited. Instead, people with this personality type are knowledgeable and curious with a playful sense of humor, and they can be incredibly entertaining. They simply have an offbeat, contrarian idea of fun – one that usually involves a healthy dose of spirited debate.
		",

	"ESTJ:
The Executive (16Personalities)
ESTJ (Executive) is a personality type with the Extraverted, Observant, Thinking, and Judging traits. They possess great fortitude, emphatically following their own sensible judgment. They often serve as a stabilizing force among others, able to offer solid direction amid adversity.
People with the ESTJ personality type (Executives) are representatives of tradition and order, utilizing their understanding of what is right, wrong, and socially acceptable to bring families and communities together. Embracing the values of honesty and dedication, ESTJs are valued for their mentorship mindset and their ability to create and follow through on plans in a diligent and efficient manner. They will happily lead the way on difficult paths, and they won’t give up when things become stressful.
		",

	"ESFJ:
The Consul (16Personalities)
ESFJ (Consul) is a personality type with the Extraverted, Observant, Feeling, and Judging traits. They are attentive and people-focused, and they enjoy taking part in their social community. Their achievements are guided by decisive values, and they willingly offer guidance to others.
For people with the ESFJ personality type (Consuls), life is sweetest when it’s shared with others. These social individuals form the bedrock of many communities, opening their homes – and their hearts – to friends, loved ones, and neighbors.
This doesn’t mean that they are saints or that they like everyone. In fact, they are much more likely to form close bonds with people who share their same values and opinions. But regardless of other people’s beliefs, ESFJ personalities still strongly believe in the power of hospitality and good manners, and they tend to feel a sense of duty to those around them. Generous and reliable, they often take it upon themselves – in ways both large and small – to hold their families and their communities together.
		",

	"ENFJ:
The Protagonist (16Personalities)
ENFJ (Protagonist) is a personality type with the Extraverted, Intuitive, Feeling, and Judging traits. These warm, forthright types love helping others, and they tend to have strong ideas and values. They back their perspective with the creative energy to achieve their goals.
People with the ENFJ personality type (Protagonists) feel called to serve a greater purpose in life. Thoughtful and idealistic, ENFJs strive to have a positive impact on other people and the world around them. These personalities rarely shy away from an opportunity to do the right thing, even when doing so is far from easy.
ENFJs are born leaders, which explains why these personalities can be found among many notable politicians, coaches, and teachers. Their passion and charisma allow them to inspire others not just in their careers but in every arena of their lives, including their relationships. Few things bring people with the ENFJ personality type a deeper sense of joy and fulfillment than guiding friends and loved ones to grow into their best selves.
		",

	"ENTJ:
The Commander (16Personalities)
ENTJ (Commander) is a personality type with the Extraverted, Intuitive, Thinking, and Judging traits. They are decisive people who love momentum and accomplishment. They gather information to construct their creative visions but rarely hesitate for long before acting on them.
People with the ENTJ personality type (Commanders) are natural-born leaders. Embodying the gifts of charisma and confidence, ENTJs project authority in a way that draws crowds together behind a common goal. However, these personalities are also characterized by an often ruthless level of rationality, using their drive, determination, and sharp mind to achieve whatever objectives they’ve set for themselves. Their intensity might sometimes rub people the wrong way, but ultimately, ENTJs take pride in both their work ethic and their impressive level of self-discipline.
		"
};

	static String calculateMBTI(char[] answers) {
	StringBuilder mbti = new StringBuilder();

	for (int g = 0; g < traitGroups.length; g++) {
		int countA = 0;
		int[] indices = traitGroups[g];
		
		for (int idx : indices) {
			if (answers[idx] == 'A') {
			countA++;
}
}
	if (countA >= 3) {
        	mbti.append(traitPairs[g][0]);
} else {
		mbti.append(traitPairs[g][1]);
}
}
	return mbti.toString();
}

	static String getDescription(String mbti) {
	for (int i = 0; i < mbtiTypes.length; i++) {
		if (mbtiTypes[i].equals(mbti)) {
		return descriptions[i];
}
}
	return "No personality description found.";
}
	
	static char[] askQuestions(Scanner scanner) {
    	char[] answers = new char[questions.length];

    	int countA = 0;
    	int countB = 0;

    	for (int i = 0; i < questions.length; i++) {
        char answer;
     
	while (true) {
            System.out.println(questions[i]);
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.equals("A") || input.equals("B")) {
                answer = input.charAt(0);
                break;
} else {
                System.out.println("Invalid input. Please enter A or B.");
}
}
		answers[i] = answer;

	if (answer == 'A') countA++;
        else countB++;

	if ((i + 1) % 5 == 0) {
            System.out.println("The number of A selected: " + countA);
            System.out.println("The number of B selected: " + countB + "\n");

            countA = 0;
            countB = 0;
}
}
    return answers;
}


}