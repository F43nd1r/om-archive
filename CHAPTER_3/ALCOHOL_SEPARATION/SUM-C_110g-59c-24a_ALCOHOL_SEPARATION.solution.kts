
solution {
    puzzle = "P024"
    name = "B X S"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -2 to 0
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 1 to -1
        rotation = 7
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to 1
        rotation = 6
        size = 1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = -1 to 0
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = 1 to 1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = 2 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
