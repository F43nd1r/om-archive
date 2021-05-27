
solution {
    puzzle = "P009"
    name = "H1"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = 9
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = -3 to 0
        rotation = 9
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -10 to 0
        rotation = 12
        size = 3
    }
    glyph(BONDER) {
        position = -5 to 0
        rotation = 9
    }
    glyph(CALCIFICATION) {
        position = -9 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -8 to 0
        rotation = 12
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -11 to 0
        positions = listOf(-1 to 0, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                back()
                reset()
                wait(2)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                back()
                back()
                forward()
                reset()
                wait(3)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                extend()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
