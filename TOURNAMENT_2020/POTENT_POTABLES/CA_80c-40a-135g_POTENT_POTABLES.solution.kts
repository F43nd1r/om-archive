
solution {
    puzzle = "w2501727721"
    name = "B S F JINYOU"
    arm(ARM1) {
        number = 1
        position = -2 to -1
        rotation = 14
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to 0
        rotation = 9
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 1 to -1
        rotation = 9
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -4 to 4
        rotation = 10
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 8
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 8
    }
    glyph(UNBONDER) {
        position = -4 to 2
        rotation = 5
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = 5
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 0
        rotation = 6
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 4
        rotation = 11
    }
    io(OUTPUT) {
        index = 1
        position = 1 to 2
        rotation = 9
    }
    track {
        position = 2 to 1
        positions = listOf(0 to 0, 0 to -1, -1 to -1)
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
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                pivotClockwise()
                rotateClockwise()
                drop()
                wait(4)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                back()
                reset()
                wait(3)
                grab()
                forward()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
