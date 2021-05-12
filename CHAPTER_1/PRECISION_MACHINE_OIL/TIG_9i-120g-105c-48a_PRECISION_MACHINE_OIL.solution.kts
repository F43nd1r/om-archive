
solution {
    puzzle = "P012"
    name = "NO-TRACK I-9"
    arm(ARM6) {
        number = 1
        position = 2 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 1 to -3
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -1 to -2
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to -1
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
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
