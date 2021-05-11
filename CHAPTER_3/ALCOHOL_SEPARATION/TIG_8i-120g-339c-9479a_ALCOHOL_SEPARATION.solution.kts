
solution {
    puzzle = "P024"
    name = "NEW SOLUTION 7"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 5 to -2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 1 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to -3
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 4 to -2
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -2 to -2
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 3 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 1 to -4
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
            sequence(2) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(1) {
                wait(9)
                rotateClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(43)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
