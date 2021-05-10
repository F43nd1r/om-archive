
solution {
    puzzle = "P017"
    name = "NEW SOLUTION 6 (Copy)"
    arm(ARM6) {
        number = 1
        position = -5 to -11
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -6 to -9
        rotation = 4
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = -6 to -5
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -6 to -7
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -6 to -10
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = -8 to -9
        rotation = 6
    }
    glyph(TRIPLEX_BONDER) {
        position = -7 to -7
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = -3 to -9
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to -12
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to -11
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -7 to -5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(15)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
