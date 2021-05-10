
solution {
    puzzle = "P017"
    name = "NEW SOLUTION 6 (Copy)"
    arm(ARM6) {
        number = 1
        position = -6 to -11
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -6 to -8
        rotation = 4
        size = 2
    }
    arm(ARM3) {
        number = 3
        position = -3 to -6
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -5 to -6
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -6 to -10
        rotation = 2
    }
    glyph(TRIPLEX_BONDER) {
        position = -9 to -7
        rotation = 5
    }
    glyph(TRIPLEX_BONDER) {
        position = -7 to -6
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -2 to -10
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -7 to -11
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to -11
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = -4 to -5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(12)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
