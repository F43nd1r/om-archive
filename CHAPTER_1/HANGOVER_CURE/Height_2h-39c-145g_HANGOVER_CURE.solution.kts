
solution {
    puzzle = "P013"
    name = "H2 6T"
    arm(ARM1) {
        number = 1
        position = -1 to 1
        rotation = 9
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to 1
        rotation = 9
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -2 to 0
        rotation = 8
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -6 to 0
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = 5
    }
    glyph(CALCIFICATION) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -6 to 1
        rotation = 0
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 0 to -1, -1 to 0)
    }
    track {
        position = -11 to 1
        positions = listOf(4 to -1, 5 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
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
            sequence(2) {
                wait(1)
                forward()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                reset()
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
                rotateCounterClockwise()
                extend()
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
                rotateCounterClockwise()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                back()
                reset()
                wait(3)
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
