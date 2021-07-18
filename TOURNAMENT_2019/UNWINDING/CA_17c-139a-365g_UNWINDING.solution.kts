
solution {
    puzzle = "w1611998067"
    name = "B CI66 4T"
    arm(ARM1) {
        number = 1
        position = 0 to 7
        rotation = 4
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 5 to 3
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 6 to 1
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = 7 to 0
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = -4 to 4
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 6
        position = -4 to 3
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -3 to 2
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -1 to -1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -2 to -1
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to 3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to 1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 0 to 5
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -1
        rotation = 0
    }
    track {
        position = -3 to 2
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = -4 to 4
        positions = listOf(0 to 0, -1 to 0, 0 to -1)
    }
    track {
        position = 6 to 1
        positions = listOf(0 to 0, -1 to 0, 0 to -1, 1 to -2, 1 to -1)
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                forward()
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                drop()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                forward()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(7)
                forward()
                grab()
                forward()
                rotateClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                forward()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                forward()
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                forward()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        )
    }
}
