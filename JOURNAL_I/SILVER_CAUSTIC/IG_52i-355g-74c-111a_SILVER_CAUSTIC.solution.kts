
solution {
    puzzle = "P057"
    name = "B CI52"
    arm(ARM1) {
        number = 1
        position = 2 to -5
        rotation = 7
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -1 to -2
        rotation = 6
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = -2 to 0
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -1 to -4
        rotation = 7
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = 4 to -2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 2 to -4
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 7
        position = 3 to -1
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 8
        position = 4 to -1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 1 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 2 to -2
        rotation = 0
    }
    track {
        position = 3 to -3
        positions = listOf(1 to 2, 1 to 3, 0 to 4)
    }
    track {
        position = 0 to -3
        positions = listOf(2 to -2, 1 to -1, 0 to 0, -1 to 0, -1 to -1)
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 1 to -4
        positions = listOf(1 to 1, 0 to 1, 1 to 0)
    }
    track {
        position = 4 to -3
        positions = listOf(0 to 0, 0 to 1)
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
            sequence(4) {
                wait(7)
                grab()
                back()
                back()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
            }
        }
        , 
        {
            sequence(1) {
                wait(4)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                grab()
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
                back()
                wait(4)
                forward()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(8)
                grab()
                forward()
                forward()
                back()
                rotateClockwise()
                drop()
                back()
            }
        }
        )
    }
}
