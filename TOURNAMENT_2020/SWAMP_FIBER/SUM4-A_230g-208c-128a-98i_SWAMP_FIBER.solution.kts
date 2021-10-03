
solution {
    puzzle = "w2501727889"
    name = "NEW SOLUTION 1"
    arm(ARM1) {
        number = 1
        position = -12 to -8
        rotation = -1
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
    glyph(BONDER) {
        position = -7 to -7
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -12 to -6
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = -12 to -9
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
        position = -6 to -6
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
        positions = listOf(6 to 0, 5 to 0, 4 to 0, 3 to 0, 2 to 0, 1 to 0, 0 to 0, -1 to 1, -1 to 2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(12)
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
            sequence(3) {
                wait(10)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(8)
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
                pivotClockwise()
                forward()
                forward()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                back()
                back()
                back()
                back()
                back()
                back()
                forward()
                reset()
            }
        }
        )
    }
}
