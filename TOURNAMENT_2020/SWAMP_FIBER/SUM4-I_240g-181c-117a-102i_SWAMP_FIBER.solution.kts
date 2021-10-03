
solution {
    puzzle = "w2501727889"
    name = "SUM ALT"
    arm(ARM1) {
        number = 1
        position = -12 to -9
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -15 to -6
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -12 to -7
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -13 to -5
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -9 to -9
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -5 to -8
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -8 to -6
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = -12 to -6
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = -12 to -8
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -13 to -8
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = -14 to -5
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -7 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -11 to -9
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -14 to -6
        rotation = 0
    }
    track {
        position = -15 to -6
        positions = listOf(0 to 0, -1 to 1, -1 to 0)
    }
    track {
        position = -9 to -9
        positions = listOf(0 to 0, -1 to 1, -1 to 2)
    }
    track {
        position = -7 to -8
        positions = listOf(-1 to 0, 0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(10)
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                wait(4)
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(23)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(30)
                grab()
                rotateClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(6)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                forward()
                drop()
                forward()
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(35)
                back()
                drop()
                back()
                back()
                grab()
                wait(2)
                forward()
                forward()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                forward()
            }
        }
        )
    }
}
