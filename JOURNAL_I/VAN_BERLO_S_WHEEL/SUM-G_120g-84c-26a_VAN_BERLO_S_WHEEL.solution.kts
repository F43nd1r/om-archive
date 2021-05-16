
solution {
    puzzle = "P054"
    name = "B X S F"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -2 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to -2
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to -3
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -1 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(2)
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                rotateClockwise()
                wait(1)
                rotateClockwise()
                wait(1)
                rotateClockwise()
                wait(3)
                rotateClockwise()
                rotateClockwise()
                wait(1)
                reset()
            }
        }
        )
    }
}
