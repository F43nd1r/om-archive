
solution {
    puzzle = "P015"
    name = "B CX 2T"
    arm(ARM1) {
        number = 1
        position = 5 to -3
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 6 to -4
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 0 to 1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to 2
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -1 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 4 to -3
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = 2 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = -1
    }
    glyph(PROJECTION) {
        position = 2 to -1
        rotation = -6
    }
    glyph(PROJECTION) {
        position = 1 to 1
        rotation = -6
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to 0
        rotation = 0
    }
    track {
        position = 4 to -3
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = 5 to -3
        positions = listOf(0 to 0, 1 to -1, 1 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                back()
                back()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                forward()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                back()
                drop()
                rotateClockwise()
                grab()
                back()
                back()
                back()
                rotateCounterClockwise()
            }
        }
        )
    }
}
