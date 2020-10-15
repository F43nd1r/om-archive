
solution {
    puzzle = "P071"
    name = "B X S"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -3 to 1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to -2
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 2 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 4 to -1
        rotation = 3
        size = 1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = -2 to 1
        rotation = 6
    }
    glyph(UNIFICATION) {
        position = 3 to 0
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
        rotation = 5
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        )
    }
}
