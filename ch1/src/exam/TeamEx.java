package exam;

import java.util.List;

public class TeamEx {
    public static void main(String[] args) {
        Team team = new Team();
        team.setId(1L);
        team.setName("team1");

        TeamMember member = new TeamMember();
        member.setId(1L);
        member.setName("홍길동");
        member.setTeam(team);

        TeamMember member2 = new TeamMember();
        member2.setId(2L);
        member2.setName("홍경민");
        member2.setTeam(team);

        System.out.println(member.getTeam());
        System.out.println(member.getTeam().getName());
        System.out.println(member2.getTeam());

        team.setMembers(List.of(member, member2));
        // System.out.println(team.getMembers());
        for (TeamMember mem : team.getMembers()) {
            System.out.printf("%s : %s\n", mem.getName(), mem.getTeam().getName());
        }
    }
}
