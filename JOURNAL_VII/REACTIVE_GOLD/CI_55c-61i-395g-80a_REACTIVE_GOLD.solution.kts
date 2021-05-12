
solution {
    puzzle = "P095"
    name = "NEW SOLUTION 5 (Copy)"
    arm(ARM1) {
        number = 1
        position = -11 to -2
        rotation = -2
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = -8 to -3
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = -7 to -7
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -10 to -2
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -9 to -2
        rotation = -2
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = -7 to -8
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -11 to -7
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -9 to -8
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = -13 to -5
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = -11 to -6
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -8 to -5
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -10 to -5
        rotation = 1
    }
    glyph(PROJECTION) {
        position = -9 to -6
        rotation = -5
    }
    glyph(PURIFICATION) {
        position = -10 to -3
        rotation = -7
    }
    glyph(PURIFICATION) {
        position = -7 to -4
        rotation = -9
    }
    io(INPUT) {
        index = 0
        position = -11 to -5
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -8 to -7
        rotation = -3
    }
    track {
        position = -10 to -2
        positions = listOf(0 to 1, 0 to 0, 1 to 0)
    }
    track {
        position = -6 to -7
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -10 to -7
        positions = listOf(0 to -1, 1 to -1, 0 to 0, -1 to 0)
    }
    track {
        position = -13 to -3
        positions = listOf(1 to 1, 1 to 0, 2 to 0, 2 to 1)
    }
    track {
        position = -12 to -5
        positions = listOf(0 to -1, 1 to -1, 0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                back()
                grab()
                forward()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(12)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                forward()
            }
        }
        , 
        {
            sequence(6) {
                wait(15)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                back()
                back()
                drop()
                wait(1)
                back()
                back()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                back()
                back()
                wait(1)
                grab()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                back()
                back()
                drop()
                wait(1)
                back()
                back()
            }
        }
        , 
        {
            sequence(8) {
                wait(3)
                back()
                back()
                wait(1)
                grab()
                back()
                back()
                drop()
            }
        }
        )
    }
}
