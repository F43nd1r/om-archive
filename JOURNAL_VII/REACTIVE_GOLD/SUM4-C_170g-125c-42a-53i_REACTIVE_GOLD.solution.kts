
solution {
    puzzle = "P095"
    name = "NEW SOLUTION 1"
    arm(ARM6) {
        number = 1
        position = 2 to -2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -1 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 3 to 0
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 1 to -4
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -1 to -1
        rotation = -2
    }
    glyph(PURIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -3
        rotation = 1
    }
    track {
        position = 3 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(15)
                pivotClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(11)
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                wait(1)
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
            }
        }
        )
    }
}
