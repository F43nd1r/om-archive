
solution {
    puzzle = "P018"
    name = "INSTRUCTIONS NO TRACK 7"
    arm(ARM6) {
        number = 1
        position = -2 to -3
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 0 to -2
        rotation = 2
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = 1 to -2
        rotation = 7
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = 1
    }
    glyph(PROJECTION) {
        position = -1 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -1 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -2
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -3 to -2
        rotation = 3
    }
    io(INPUT) {
        index = 2
        position = 1 to 0
        rotation = 0
    }
    tape {
        parallel(
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
        , 
        {
            sequence(1) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
