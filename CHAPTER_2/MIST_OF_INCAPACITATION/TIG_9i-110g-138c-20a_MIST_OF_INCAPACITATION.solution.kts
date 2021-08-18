
solution {
    puzzle = "P018"
    name = "TIG"
    arm(ARM6) {
        number = 1
        position = 2 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 0
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -1 to -1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to -2
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 2 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(3)
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
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
