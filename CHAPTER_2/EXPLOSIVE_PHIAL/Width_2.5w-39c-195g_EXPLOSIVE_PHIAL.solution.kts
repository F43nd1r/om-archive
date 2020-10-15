
solution {
    puzzle = "P017"
    name = "W2.5 6T"
    arm(PISTON) {
        number = 1
        position = -5 to -2
        rotation = -6
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -3 to -3
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -4 to -4
        rotation = -5
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = -2 to 1
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -1 to 2
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = -6
    }
    glyph(TRIPLEX_BONDER) {
        position = -4 to -2
        rotation = -6
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = -4 to -3
        rotation = 0
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 1, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
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
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                retract()
                back()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                retract()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                forward()
                grab()
                back()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        )
    }
}
