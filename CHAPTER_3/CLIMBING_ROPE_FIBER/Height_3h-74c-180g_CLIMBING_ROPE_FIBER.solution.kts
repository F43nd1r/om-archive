
solution {
    puzzle = "P027"
    name = "H3 C 6T"
    arm(ARM1) {
        number = 1
        position = 1 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to 1
        rotation = 6
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = 0 to 2
        rotation = 0
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 4 to 1
        rotation = 0
    }
    track {
        position = -1 to 2
        positions = listOf(0 to 0, -1 to 0, -1 to -1, 0 to -1, 1 to -1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
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
                wait(5)
                repeat()
                wait(5)
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
                wait(8)
                grab()
                extend()
                retract()
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
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(4)
                back()
                reset()
                wait(1)
                grab()
                extend()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                forward()
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
                wait(5)
                repeat()
                wait(5)
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
                wait(4)
                grab()
                back()
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
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                back()
                back()
                back()
                forward()
                reset()
            }
        }
        )
    }
}
