
solution {
    puzzle = "P027"
    name = "INSTRUCTIONS NO TRACK 13"
    arm(ARM6) {
        number = 1
        position = 1 to 0
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 0 to 1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 6 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 5 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 7 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 7 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
