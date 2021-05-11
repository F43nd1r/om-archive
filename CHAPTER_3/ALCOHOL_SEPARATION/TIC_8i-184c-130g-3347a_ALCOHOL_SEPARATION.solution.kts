
solution {
    puzzle = "P024"
    name = "NEW SOLUTION 1"
    arm(ARM6) {
        number = 1
        position = -1 to 2
        rotation = 0
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = 3 to -2
        rotation = -3
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -4 to 3
        rotation = 9
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to 2
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 2 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -4 to 5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -5 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = -5 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = -1 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                rotateClockwise()
            }
        }
        )
    }
}
