
solution {
    puzzle = "P012"
    name = "OVERLAP ACX"
    arm(ARM1) {
        number = 1
        position = -2 to 1
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to -1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -2 to 0
        rotation = 6
    }
    glyph(PROJECTION) {
        position = -1 to 0
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 0
        rotation = 0
    }
    track {
        position = -1 to 0
        positions = listOf(-1 to 1, 0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(1)
                grab()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
