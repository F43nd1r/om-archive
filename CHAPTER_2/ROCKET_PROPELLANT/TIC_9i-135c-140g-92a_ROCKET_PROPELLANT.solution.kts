
solution {
    puzzle = "P019"
    name = "INSTRUCTIONS NO TRACK 8"
    arm(ARM6) {
        number = 1
        position = -3 to -2
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -3 to 1
        rotation = -2
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = 2 to 1
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -4 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -5
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
