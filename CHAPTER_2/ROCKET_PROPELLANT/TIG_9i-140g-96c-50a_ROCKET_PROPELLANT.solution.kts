
solution {
    puzzle = "P019"
    name = "NO-TRACK I-9 (Copy)"
    arm(ARM6) {
        number = 1
        position = -3 to 1
        rotation = 2
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = 1 to -1
        rotation = -2
        size = 1
    }
    arm(ARM2) {
        number = 3
        position = 1 to -3
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -4 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -4 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
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
            sequence(2) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
