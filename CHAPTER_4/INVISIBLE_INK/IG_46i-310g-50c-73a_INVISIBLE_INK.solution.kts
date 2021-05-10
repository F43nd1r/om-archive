
solution {
    puzzle = "P032"
    name = "NEW SOLUTION 5"
    arm(ARM6) {
        number = 1
        position = -13 to -7
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -11 to -8
        rotation = 3
        size = 1
    }
    arm(ARM2) {
        number = 3
        position = -10 to -8
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -9 to -10
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -4 to -9
        rotation = -3
        size = 1
    }
    arm(ARM3) {
        number = 6
        position = -6 to -8
        rotation = 0
        size = 1
    }
    arm(ARM2) {
        number = 7
        position = -7 to -8
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -8 to -6
        rotation = -2
        size = 3
    }
    glyph(BONDER) {
        position = -13 to -6
        rotation = -1
    }
    glyph(BONDER) {
        position = -4 to -10
        rotation = -4
    }
    glyph(CALCIFICATION) {
        position = -14 to -6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -12 to -6
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -10
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to -10
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -9 to -8
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -10 to -6
        rotation = -5
    }
    io(INPUT) {
        index = 0
        position = -12 to -8
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -5 to -8
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -6 to -10
        rotation = -5
    }
    track {
        position = -10 to -9
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = -7 to -7
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                rotateCounterClockwise()
                back()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                rotateClockwise()
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
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(5)
                grab()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
