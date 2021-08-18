
solution {
    puzzle = "P018"
    name = "TIC"
    arm(ARM6) {
        number = 1
        position = 2 to -2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -1 to 0
        rotation = 3
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = -2 to 1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -1 to -1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 3 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -4 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(1)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
