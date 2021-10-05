
solution {
    puzzle = "P098"
    name = "TWO BETTER"
    arm(ARM1) {
        number = 1
        position = 2 to 2
        rotation = 10
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to 1
        rotation = 0
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 3
        position = -5 to -2
        rotation = -13
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -4 to -1
        rotation = -6
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = -1 to -3
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = -3 to -3
        rotation = -7
    }
    glyph(BONDER) {
        position = -1 to -4
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 0 to -4
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -4 to -2
        rotation = -12
    }
    glyph(PURIFICATION) {
        position = 3 to 2
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = -13
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -2
        rotation = 5
    }
    io(INPUT) {
        index = 1
        position = 2 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(2)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(3)
                rotateClockwise()
                wait(3)
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(9)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
