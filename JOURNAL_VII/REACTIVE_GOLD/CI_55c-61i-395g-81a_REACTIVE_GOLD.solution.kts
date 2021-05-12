
solution {
    puzzle = "P095"
    name = "NEW SOLUTION 1"
    arm(ARM1) {
        number = 1
        position = -5 to 1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -3 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -3 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -1 to -2
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = 1 to -2
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = 0 to 3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -2 to 4
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -1 to 4
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = -3 to 4
        rotation = -2
        size = 2
    }
    arm(ARM3) {
        number = 10
        position = 1 to -1
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = 1
    }
    glyph(PROJECTION) {
        position = -1 to 0
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -2 to 3
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 1 to 2
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = -3
    }
    track {
        position = -5 to 1
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 1 to -1)
    }
    track {
        position = -3 to -1
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 1 to -1)
    }
    track {
        position = -2 to 4
        positions = listOf(1 to 0, 0 to 0, 0 to 1)
    }
    track {
        position = -3 to 4
        positions = listOf(0 to 0, 0 to -1, -1 to 0, -1 to 1)
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                forward()
                forward()
                drop()
                wait(1)
                forward()
                forward()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                forward()
                forward()
                wait(1)
                grab()
                forward()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                forward()
                forward()
                drop()
                wait(1)
                forward()
                forward()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                forward()
                forward()
                wait(1)
                grab()
                forward()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                grab()
                forward()
                drop()
                back()
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(5)
                forward()
                grab()
                back()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(15)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(12)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                forward()
                back()
            }
        }
        , 
        {
            sequence(9) {
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
