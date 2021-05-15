
solution {
    puzzle = "P039"
    name = "LAZY SUM4"
    arm(ARM6) {
        number = 1
        position = -2 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to -2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to 5
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to 3
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 4
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -2 to 0
        rotation = 0
    }
    track {
        position = 1 to -2
        positions = listOf(0 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = -2 to 5
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                forward()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                drop()
                forward()
                rotateClockwise()
            }
        }
        )
    }
}
