
solution {
    puzzle = "w2450508212"
    name = "NEW SOLUTION 1 (Copy)"
    arm(ARM1) {
        number = 1
        position = -8 to -6
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -15 to -5
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = -20 to -6
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -23 to -5
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -7 to -5
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -8 to -5
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -4 to -5
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -7 to -6
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -12 to -6
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -14 to -6
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -20 to -5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -11 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -26 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -10 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -24 to -6
        rotation = -3
    }
    track {
        position = -8 to -6
        positions = listOf(0 to 0, -1 to 1)
    }
    track {
        position = -15 to -5
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -3 to 0, -3 to -1)
    }
    track {
        position = -20 to -6
        positions = listOf(0 to 0, -1 to 0, -2 to 1)
    }
    track {
        position = -23 to -5
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -3 to 0, -4 to 0, -5 to 0, -5 to -1, -4 to -1)
    }
    track {
        position = -7 to -5
        positions = listOf(-1 to 0, 0 to 0, 1 to 0, 2 to 0, 3 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
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
                wait(3)
                grab()
                forward()
                forward()
                forward()
                forward()
                retract()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(11)
                grab()
                retract()
                retract()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(17)
                grab()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                forward()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                back()
                rotateClockwise()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                forward()
                forward()
                drop()
                back()
                forward()
                wait(1)
                back()
                back()
                grab()
                forward()
                drop()
                forward()
                wait(1)
                back()
                back()
            }
        }
        , 
        {
            sequence(7) {
                wait(16)
                back()
                back()
                grab()
                forward()
                forward()
                wait(1)
                back()
                forward()
                drop()
            }
        }
        )
    }
}
