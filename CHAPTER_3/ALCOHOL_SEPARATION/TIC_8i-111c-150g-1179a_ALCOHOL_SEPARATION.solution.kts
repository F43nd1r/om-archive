
solution {
    puzzle = "P024"
    name = "NEW SOLUTION 7 (Copy)"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -3 to 4
        rotation = -2
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 0 to -2
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = 1 to 3
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 2 to 2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 2
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = -2 to 3
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 4
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 2 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 0 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = 1 to 4
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
                wait(13)
                rotateCounterClockwise()
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
        )
    }
}
