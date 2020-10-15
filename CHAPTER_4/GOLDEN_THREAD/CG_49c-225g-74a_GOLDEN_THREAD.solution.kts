
solution {
    puzzle = "P037"
    name = "B CA 6T"
    arm(PISTON) {
        number = 1
        position = 2 to 1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 4 to -2
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 5 to -2
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 3 to -4
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = -3
    }
    glyph(MULTI_BONDER) {
        position = 2 to -2
        rotation = -1
    }
    io(INFINITE) {
        index = 0
        position = -11 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -2
        rotation = 0
    }
    track {
        position = 4 to -2
        positions = listOf(0 to 0, 1 to 0, 1 to 1)
    }
    track {
        position = 0 to -2
        positions = listOf(0 to 0, 1 to -1, 2 to -2, 3 to -2)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                wait(1)
                forward()
                back()
                reset()
                wait(2)
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
            sequence(1) {
                wait(1)
                grab()
                rotateClockwise()
                extend()
                extend()
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
            sequence(3) {
                wait(2)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
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
            sequence(4) {
                wait(4)
                grab()
                retract()
                back()
                back()
                extend()
                reset()
                wait(2)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                retract()
                back()
                back()
                back()
                forward()
                extend()
                reset()
            }
        }
        )
    }
}
